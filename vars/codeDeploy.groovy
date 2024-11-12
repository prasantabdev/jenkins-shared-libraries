def call (String imageName,String tagName, Integer portLocal, Interger portContainer){
sh "docker compose down && docker compose up --build"
}
