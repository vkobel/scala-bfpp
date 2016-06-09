import scala.collection.mutable.ArrayBuffer

package klaat.brainfuckpp {

  class BrainFuckPlusPlus {

    private val _cells = ArrayBuffer.fill(100)(0)
    private var _cellPtr = 0

    private def Cell = _cells(_cellPtr)
    private def Cell(v:Int) { _cells(_cellPtr) += v }
    private def Move(v:Int) { _cellPtr += v }
    
    val F = this

    def debug() {
      println("at " + _cellPtr)
      println(_cells)
    }
  
    // Loop implementation
    def /(toLoop: => Unit){
      while(Cell > 0){
        toLoop
      }
    }

    def ! {
      print(Cell.toChar)
    }

    // Basics inc
    def +(v:Int){
      Cell(v)
    }
    def + { F + 1 }
    
    def -(v:Int){
      Cell(-v)
    }
    def - { F - 1 }
    
    // Basics move
    def >(v:Int){
      Move(v)
    }
    def > { F > 1 }

    def <(v:Int){
      Move(-v)
    }
    def < { F < 1 }

    def >+(v:Int){
      >
      F + v
    }
    def >+ { F >+ 1 }

    def +>(v:Int){
      F > v
      F + 1
    }
    def +> { F +> 1 }

    def >-(v:Int){
      >
      F - v
    }
    def >- { F >- 1}

    def ->(v:Int){
      F > v
      F - 1
    }
    def -> { F -> 1}

    def <+(v:Int){
      <
      F + v
    }
    def <+ { F <+ 1 }

    def +<(v:Int){
      F < v
      F + 1
    }
    def +< { F +< 1 }

    // CHELOU !!!!
    def <<-(v:Int){
      <
      F - v
    }
    def <<- { F <<- 1 }
    // END OF CHELOU

    def -<(v:Int){
      F < v
      F - 1
    }
    def -< { F -< 1 }

  }
}
