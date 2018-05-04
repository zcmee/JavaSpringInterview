package purejava;

class StaticInitializeBlockTest {

     //Blok inicjalizacji instancyjnej:
     //wykonywany dla każdej instancji dokładnie raz (tak, jak konstruktor). Wykonywany jest przed konstruktorem
    {
        System.out.println("HERERE I GO {} ");
    }

    //Blok inicjalizacji statycznej:
    //Blok inicjalizacji statycznej jest wykonywany tylko raz przy ładowaniu klasy.
    static {
        System.out.println("HERERE I GO static{} ");
    }


    public StaticInitializeBlockTest() {
        System.out.println("Konstruktor makumba");
    }

    {
         System.out.println("HERERE I GO 2{} ");
    }

}

    public class StaticInitializeBlock {

        public static void main(String[] args) {
            StaticInitializeBlockTest test1 = new StaticInitializeBlockTest();
            StaticInitializeBlockTest test2 = new StaticInitializeBlockTest();
        }

//        OUTPUT:
//        HERERE I GO static{}
//        HERERE I GO {}
//        HERERE I GO 2{}
//        Konstruktor makumba
//        HERERE I GO {}
//        HERERE I GO 2{}
//        Konstruktor makumba

    }


