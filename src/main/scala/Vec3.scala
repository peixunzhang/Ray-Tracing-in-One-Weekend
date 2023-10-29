final case class Vec3(_1: Double, _2: Double, _3: Double) {

  def unary_- : Vec3 = Vec3(- _1, - _2, - _3)
  
  def +(other: Vec3): Vec3 = Vec3(_1+other._1, _2+other._2, _3+other._3)

  def *(num: Double): Vec3 = Vec3(_1*num, _2*num, _3*num)

  def /(num: Double): Vec3 = this * (1 / num)

  def lengthSquared: Double = (_1 * _1) + (_2 * _2) + (_3 * _3)

  def length: Double = Math.sqrt(lengthSquared)

  def dot(other: Vec3): Double = (_1 * other._1) + (_2 * other._2) + (_3 * other._3)

  def cross(other: Vec3): Vec3 = Vec3((_2 * other._3) - (_3 * other._2), (_3 * other._1) - (_1 * other._3), (_1 * other._2) - (_2 * other._1))

  def unit: Vec3 = this / this.length
}
