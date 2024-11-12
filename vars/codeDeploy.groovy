def call (){
sh "docker rmi -f $(docker images -aq)"
sh "docker compose down && docker compose up -d --build"
}
