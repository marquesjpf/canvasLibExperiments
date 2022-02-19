import pt.isel.canvas.*

//arena

const val ARENAW = 700 //arena width
const val ARENAH = 500 //arena height
const val ARENAC = WHITE //arena color

val arena = Canvas(ARENAW,ARENAH,ARENAC)

//ball
const val BALLRAD = 15 //radius
const val BALLT = 2 //thickness

//ball position and movement
const val BALLINITX = ARENAW / 2 //initial X location
const val BALLINITY = ARENAH / 2 //initial Y location
const val MDELTA = 3    //ball movement delta
const val LEFT = 1
const val RIGHT = 2
const val UP = 3
const val DOWN = 4


//obstacles and collision
val SQUAREXINIT = ARENAW / 4
val SQUAREYINIT = ARENAH / 4
const val SDELTA = 2 //square movement delta
const val SLEFT = 5
const val SRIGHT = 6
const val SUP = 7
const val SDOWN = 8
const val STICK = 3
const val SSIDE = 30

val XVALID = 0 + BALLRAD..ARENAW - BALLRAD
val YVALID = 0 + BALLRAD..ARENAH - BALLRAD
val SXVALID = 0..ARENAW - SSIDE
val SYVALID = 0..ARENAH - SSIDE

val OBSTACLEXINIT = (SQUAREXINIT - BALLRAD)..(SQUAREXINIT + SSIDE + BALLRAD)
val OBSTACLEYINIT = (SQUAREYINIT - BALLRAD)..(SQUAREYINIT + SSIDE + BALLRAD)