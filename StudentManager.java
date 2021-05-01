public class StudentManager extends UserManager{
	
    @Override
    public void add(User user){
      System.out.println(user.getFirstName()+" "+user.getLastName()+" kaydedildi.");
      }
    
    @Override
    public void addMultiple (User[] users){
          for(User user: users){
              add(user);
          }
      }
    
      
}