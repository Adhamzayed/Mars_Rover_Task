package mars_rover;

public class Mars_Rover {
	public static void main(String[] args) {        
	     Mars p = new Mars(1,2,"NORTH");
	     
	     // PART I
	      System.out.println("Part1  ");
	      p.direction("FRFFFLFBBLFF");
	      
	      
	      
//	       PART II
	      System.out.println("Part2  ");
	      int [][]obstacle = {{1,4},{-1,0},{0,-1},{4,3},{7,4},{0,-3}};
	     p.direction("FRFFFLFBBLFF" , obstacle);
	     
	     

//	      part III
	        System.out.println("Part3  ");
	        int [][]obstacle1 = {{1,4},{-1,0},{0,-1},{2,3},{7,4},{0,-3}}; 
//	      arguments is (heading x, heading y, obstacles)  
	        String commands =  p.generate_command(5, 3 , obstacle1);
	       System.out.println(commands);
	        
	         
	         
	    
	     }
	    }
