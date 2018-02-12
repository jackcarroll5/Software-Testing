


public class Robot {
public String name;
private boolean working = false;

    public String getName() {
        return name;
    }

     private void setName(String name) {
         if(name.isEmpty())
         {
             throw new IllegalArgumentException();
         }
         this.name = name;
    }

    public Robot()
    {
      setName("");

    }

    public Robot(String name)
    {
        setName(name);

    }

    public boolean isWorking() {
        return working;
    }

    public void setWorking(boolean working) {
        this.working = working;
    }

    public void talkToRobot()
    {
        working = true;
    }

   public String getWorkMessage()
   {
       if(!working)
       {
           throw new IllegalStateException();
       }
       else
           return "I am working";
   }

   public void waitUntilWorking()
   {
     while (!working)//Infinite Loop
     {
         //Nothing done here
     }


   }


}
