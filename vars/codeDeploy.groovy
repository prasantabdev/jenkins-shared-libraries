def call (String imageName,String tagName, Integer portLocal, Interger portContainer){
sh "docker run -d -p ${portLocal}:${portContainer} ${imageName}:${tagName}"
}
