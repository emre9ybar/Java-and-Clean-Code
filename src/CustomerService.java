
public class CustomerService implements interFaceCustomer {

   private  interFaceCustomer interFaceCustomer;

   public CustomerService(interFaceCustomer interFaceCustomer){
       this.interFaceCustomer=interFaceCustomer;
   }

    @Override
    public void add() {
        interFaceCustomer.add();

    }
}
