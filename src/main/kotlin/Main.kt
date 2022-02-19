import pt.isel.canvas.*

var game = Game(BALLINITX,BALLINITY,BALLRAD,BLACK,BALLT,UP,SQUAREXINIT,SQUAREYINIT,SSIDE,BLACK,STICK,SLEFT,OBSTACLEXINIT,OBSTACLEYINIT)

fun main(args: Array<String>) {


    onStart {

    }
        //key commands
        arena.onKeyPressed { keyEvent: KeyEvent ->
            when (keyEvent.code) {
                LEFT_CODE -> game = game.copy(direction = LEFT)
                RIGHT_CODE -> game = game.copy(direction = RIGHT)
                UP_CODE -> game = game.copy(direction = UP)
                DOWN_CODE -> game = game.copy(direction = DOWN)
            }
            when(keyEvent.char) {
                'a' -> game = game.copy(squareDirection = SLEFT)
                'd' -> game = game.copy(squareDirection = SRIGHT)
                'w' -> game = game.copy(squareDirection = SUP)
                's' -> game = game.copy(squareDirection = SDOWN)
            }
        }

        arena.onTimeProgress(1){
            arena.erase()
            arena.drawCircle(game.ballX,game.ballY,game.ballR,game.ballC,game.ballT)
            arena.drawRect(game.squareX,game.squareY,game.squareSide,game.squareSide,game.squareC,game.squareT)

            when(game.direction){
                LEFT -> moveLeft()
                RIGHT -> moveRight()
                UP -> moveUp()
                DOWN -> moveDown()
            }
            when(game.squareDirection){
                SLEFT -> moveSLeft()
                SRIGHT -> moveSRight()
                SUP -> moveSUp()
                SDOWN -> moveSDown()
            }
            //collision
            if(game.ballX !in XVALID || game.ballY !in YVALID || (game.ballX in game.obstacleX && game.ballY in game.obstacleY)){
                when (game.direction){
                    RIGHT -> game = game.copy(direction = LEFT)
                    LEFT -> game = game.copy(direction = RIGHT)
                    UP -> game = game.copy(direction = DOWN)
                    DOWN -> game = game.copy(direction = UP)
                }
            }
            if(game.squareX !in SXVALID || game.squareY !in SYVALID){
                when (game.squareDirection){
                    SRIGHT -> game = game.copy(squareDirection = SLEFT)
                    SLEFT -> game = game.copy(squareDirection = SRIGHT)
                    SUP -> game = game.copy(squareDirection = SDOWN)
                    SDOWN -> game = game.copy(squareDirection = SUP)
            }

        }

    }
    onFinish {
        println("end")
    }

    println("Program arguments: ${args.joinToString()}")
}
