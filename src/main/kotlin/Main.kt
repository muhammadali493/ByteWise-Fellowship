fun calcRecArea(){
    println("Enter length: ")
    val length = readLine()?.toInt()
    println("Enter Width: ")
    val width = readLine()?.toInt()
    if(length != null && width != null)
        println("Area of Rectangle is: ${length*width}")
    else
        println("Invalid Input")
}
fun calcCircleArea(){
    println("Enter the radius of Circle: ")
    val radius = readLine()?.toFloat()
    if(radius != null)
        println("Area of circle is: ${3.14*radius*radius}")
    else
        println("Invalid Input")
}
fun calcTriangleArea(){
    println("Enter the base of triangle: ")
    val base = readLine()?.toFloat()
    println("Enter the height: ")
    val height = readLine()?.toFloat()
    if(base != null && height != null)
        println("Area of triangle is: ${0.5*base*height}")
}
fun calcTrapezoidArea(){
    println("Enter base1: ")
    val base1 = readLine()?.toFloat()
    println("Enter base2: ")
    val base2 = readLine()?.toFloat()
    println("Enter the height: ")
    val height = readLine()?.toFloat()
    if(base1 != null && base2 != null && height != null)
        println("Area of Trapezoid is ${0.5*(base1+base2)*height}")
}
fun RectangularPrismVol(){
    println("Enter the length of Prism: ")
    val length = readLine()?.toFloat()
    println("Enter the width of Prism: ")
    val width= readLine()?.toFloat()
    println("Enter the height of Prism: ")
    val height= readLine()?.toFloat()
    if(length != null && width != null && height != null)
        println("Volume of Prism: ${length*width*height}")
    else
        println("Invalid input")
}
fun sphereVol(){
    println("Enter the radius of sphere: ")
    val radius= readLine()?.toFloat()
    if(radius != null)
        println("Volume of sphere: ${(4*3.14*radius*radius*radius)/3}")
}
fun cylinderVol(){
    println("Enter Area of base: ")
    val baseArea = readLine()?.toFloat()
    println("Enter height: ")
    val height = readLine()?.toFloat()
    if(baseArea != null && height != null)
        println("Volume of cylinder: ${baseArea*height}")
}
fun main() {
    println("Welcome to shape Measurement!")
    var running: Boolean = true
    while (running) {
        println("Please Enter your choice: ")
        println("1. calculate Area")
        println("2. calculate Volume")
        println("3. Exit")
        val choice = readLine()?.toInt()
        when (choice) {
            1 -> {//Area
                println("Please select a shape: ")
                println("1. Rectangle")
                println("2. Circle")
                println("3. Triangle")
                println("4. Trapezoid")
                val input = readLine()?.toInt()
                when (input) {
                    1 -> calcRecArea()
                    2 -> calcCircleArea()
                    3 -> calcTriangleArea()
                    4 -> calcTrapezoidArea()
                    else -> {
                        println("Invalid input!")
                        continue
                    }

                }

            }

            2 -> {//Volume
                println("Please select a shape: ")
                println("1. Rectangular Prism")
                println("2. Sphere")
                println("3. Cylinder")
                val input = readLine()?.toInt()
                when (input) {
                    1 -> RectangularPrismVol()
                    2 -> sphereVol()
                    3 -> cylinderVol()
                    else -> {
                        println("Invalid input!")
                        continue
                    }
                }

            }
            3 -> {
                break
            }
            else -> {
                println("Invalied Choice!")
                continue
            }

        }
    }
}