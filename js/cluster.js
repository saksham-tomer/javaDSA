import  cluster  from "cluster";
import http from "http";
import { availableParallelism } from "os";
import process from "process";


const numOfCpu = availableParallelism();
console.log(numOfCpu);

if(cluster.isPrimary){
console.log(`the pid is ${process.pid}`);

for (let i=0;i<numOfCpu;i++){
    cluster.fork()
}

cluster.on('exit',(worker,code,signal)=>{
    console.log(`worker ${worker.process.pid} died`)
})

}
else {
    http.createServer((req,res)=>{
        res.writeHead(200)
        res.end('hello world')

    }).listen(4000)
    console.log(`Worker ${process.pid} started`)
}