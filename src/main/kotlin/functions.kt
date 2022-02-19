fun moveRight(){
    game = game.copy(ballX = game.ballX + MDELTA)
}

fun moveLeft(){
    game = game.copy(ballX = game.ballX - MDELTA)
}

fun moveUp(){
    game = game.copy(ballY = game.ballY - MDELTA)
}

fun moveDown(){
    game = game.copy(ballY = game.ballY + MDELTA)
}

fun moveSRight(){
    game = game.copy(squareX = game.squareX + SDELTA, obstacleX = (game.squareX - BALLRAD)..(game.squareX+ SSIDE + BALLRAD))
}

fun moveSLeft(){
    game = game.copy(squareX = game.squareX - SDELTA, obstacleX = (game.squareX - BALLRAD)..(game.squareX+ SSIDE + BALLRAD))
}

fun moveSUp(){
    game = game.copy(squareY = game.squareY - SDELTA, obstacleY = (game.squareY - BALLRAD)..(game.squareY+ SSIDE + BALLRAD))
}

fun moveSDown(){
    game = game.copy(squareY = game.squareY + SDELTA, obstacleY = (game.squareY - BALLRAD)..(game.squareY+ SSIDE + BALLRAD))
}