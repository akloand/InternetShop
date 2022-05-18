package Bank;

public class MainBank {
    public static void main(String[] args) {
        BankDetails details = new BankDetails();
        details.setBillNumber("4000005068505066");
        Company company = new Company("Энерго-транс", details);
        //code

        details.setBillNumber("3005000000050006");

        System.out.println(company);

        BankDetails copy = new BankDetails(
                details.getBillNumber(),
                details.getCorrespondenceBill(),
                details.getBikNumber(),
                details.getBankName(),
                details.getCity()
        );

    }
}
