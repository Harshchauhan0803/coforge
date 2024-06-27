var http=require('http')
http.createServer((req,resp)=>{
    resp.writeHead(200,{'Content-Type':'text/html'})
    resp.write("<h2>My Server</h2>")
    resp.write("<h2>This is node js application</h2>")
    resp.end('<p>hello world')
}).listen(1000)
console.log('server running')