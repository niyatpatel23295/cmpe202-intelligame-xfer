package MrMonkey;

public class RunTest {
    
    public static void main( String [] args )
    {
        System.out.println( "Testing Level1Factory...") ;
        Level1Factory l1 = new Level1Factory() ;
        l1.buildOrder() ;
        
        System.out.println( "Testing Level2Factory...") ;
        Level2Factory l2 = new Level2Factory() ;
        l2.buildOrder() ;

        System.out.println( "Testing Level3Factory...") ;
        Level3Factory l3 = new Level3Factory() ;
        l3.buildOrder() ;
        
    }

}
