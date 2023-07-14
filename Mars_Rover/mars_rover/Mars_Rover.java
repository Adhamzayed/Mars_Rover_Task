package mars_rover;

public class Mars_Rover {
	public static void main(String[] args) {        
	     Mars p = new Mars(6,4,"NORTH");
	     
	     // PART I
	      System.out.println("Part1  ");
	      p.direction("FLFFFRFLB");
	      System.out.println();

	      
	      
//	       PART II
	      System.out.println("Part2  ");
	      int [][]obstacle = {{1,4},{3,5},{7,4}};
	     p.direction("FLFFFRFLB" , obstacle);
	     
	      System.out.println();


//	      part III
	        System.out.println("Part3  ");
	        int [][]obstacle1 = {{1,4},{3,5},{7,4}}; 
//	      arguments is (heading x, heading y, obstacles)  
	        String commands =  p.generate_command(6,4, obstacle1);
	       System.out.println(commands);
	        
	         
	         
	    
	     }
	    }
