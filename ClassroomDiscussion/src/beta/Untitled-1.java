Upcasting:

    Referring to the sub class object using a super class object reference
    class Table extends Furniture{
        // Subclass specific implementation

        void activities(){
            System.out.println("Drawing");
        }
    }
    Furniture f = new Table();

Downcasting:

    main(){
        Furniture f = new Table();
        Table t = (Table) f; // Downcasting
        t.activities();
        
    }