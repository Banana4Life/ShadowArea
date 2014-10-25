package util

case class Point(a: Int, b: Int) extends java.awt.Point(a, b) {
    implicit def Double2Int(d: Double) = d.toInt

    def this(point: Point) = this(point.x, point.y)
    def this(point: java.awt.Point) = this(point.x, point.y)

    def - (point: Point) = new Point(this.x - point.x, this.y - point.y)

    def angle = math.atan2(y, x)
}