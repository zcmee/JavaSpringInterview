package purejava;

//Jak pisałem w artykule "SCJP - Konstruktory i inicjalizacja" pierwszą instrukcją konstruktora jest zawsze wywołanie konstruktora nadklasy albo innego konstruktora tej samej klasy.
//Właśnie zaraz po tym wywołaniu – przed wykonaniem jakiejkolwiek innej instrukcji konstruktora – wykonywany jest kod bloków inicjalizacyjnych instancji.
//A co się stanie, jeśli kod bloku inicjalizującego spowoduje wyjątek, np. odwołamy się do niewłaściwego indeksu tablicy? Naturalnie wyjątek zostanie zwrócony… w postaci opakowanej w java.lang.ExceptionInInitializerError.

class StaticInitializeBlockTest {

     //Blok inicjalizacji instancyjnej:
     //wykonywany dla każdej instancji dokładnie raz (tak, jak konstruktor). Wykonywany jest przed konstruktorem
    {
        System.out.println("HERERE I GO {} ");
    }

    //Blok inicjalizacji statycznej:
    //Blok inicjalizacji statycznej jest wykonywany tylko raz przy ładowaniu klasy.
    static {
        System.out.println("HERERE I GO static2{} ");
    }

    static {
        System.out.println("HERERE I GO static1{} ");
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

//        HERERE I GO static2{}
//        HERERE I GO static1{}
//        HERERE I GO {}
//        HERERE I GO 2{}
//        Konstruktor makumba
//        HERERE I GO {}
//        HERERE I GO 2{}
//        Konstruktor makumba

    }


