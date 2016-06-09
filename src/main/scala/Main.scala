import klaat.brainfuckpp.BrainFuckPlusPlus
import language.postfixOps

object Main extends App {

  println
  Bfpp
  println

  object Bfpp extends BrainFuckPlusPlus {    
    F +8 
    F / {
      F >+ 4
      F / {
        F >+ 2
        F >+ 3
        F >+ 3
        F >+;
        F < 4
        F -;
      }
      F >+;
      F >+;
      F >-;
      F +> 2
      F / { < }
      F <<-;
    }
  
    // Print
    F > 2; F!;
    F >; F - 3; F!;
    F + 7; F!;
    F!;
    F + 3; F!;
    F > 2; F!;
    F <<-; F!;
    F <; F!;
    F + 3; F!;
    F - 6; F!;
    F - 8; F!;
    F > 2; F +; F!;
    F >; F + 2; F!;

  }
}

