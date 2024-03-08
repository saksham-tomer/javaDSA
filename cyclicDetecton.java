import java.util.*;

class ServerNode {
    private String id;

    public ServerNode(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    // Other properties and methods as needed
}

class ConsistentHashing {
    private TreeMap<Integer, ServerNode> circle = new TreeMap<>();
    private int replicationFactor; // Number of virtual nodes per physical node

    public ConsistentHashing(int replicationFactor) {
        this.replicationFactor = replicationFactor;
    }

    // Add a server to the consistent hash ring with virtual nodes
    public void addServer(ServerNode serverNode) {
        for (int i = 0; i < replicationFactor; i++) {
            int hash = hash(serverNode.getId() + i);
            circle.put(hash, serverNode);
        }
    }

    // Remove a server (including virtual nodes) from the consistent hash ring
    public void removeServer(ServerNode serverNode) {
        Iterator<Map.Entry<Integer, ServerNode>> iterator = circle.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, ServerNode> entry = iterator.next();
            if (entry.getValue().equals(serverNode)) {
                iterator.remove();
            }
        }
    }

    // Get the server for a given key
    public ServerNode getServer(String key) {
        if (circle.isEmpty()) {
            return null;
        }

        int hash = hash(key);
        SortedMap<Integer, ServerNode> tailMap = circle.tailMap(hash);
        int firstKey = tailMap.isEmpty() ? circle.firstKey() : tailMap.firstKey();

        return circle.get(firstKey);
    }

    // Hashing function (replace with a more robust hash function in production)
    private int hash(String input) {
        return Objects.hash(input);
    }

    public static void main(String[] args) {
        // Example usage
        ConsistentHashing consistentHashing = new ConsistentHashing(3); // Replication factor = 3

        ServerNode server1 = new ServerNode("Server-1");
        ServerNode server2 = new ServerNode("Server-2");
        ServerNode server3 = new ServerNode("Server-3");

        consistentHashing.addServer(server1);
        consistentHashing.addServer(server2);
        consistentHashing.addServer(server3);

        // Example of removing a server
        consistentHashing.removeServer(server2);

        // Get the server for a given key after server removal
        String key = "someKey";
        ServerNode reassignedServer = consistentHashing.getServer(key);

        System.out.println("Key '" + key + "' is reassigned to server: " + reassignedServer.getId());
    }
}
