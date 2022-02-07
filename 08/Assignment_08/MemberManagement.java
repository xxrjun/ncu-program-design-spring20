//109403019
public class MemberManagement {
    public static void main(String[] args){
        Club c = new Club();
        c.addMember(new Member("John", 200));
        c.addMember(new Member("Mary", 500));
        c.addMember(new Member("Helen", 100));
        c.addMember(new Member("Cindy", 300));
        c.addMember(new Member("Petty", 400));
        c.addMember(new Member("Hoan", 100));
        System.out.println(c);
        System.out.println("Total revenue from membership fee: "+ c.totalFees());
    } 
}
