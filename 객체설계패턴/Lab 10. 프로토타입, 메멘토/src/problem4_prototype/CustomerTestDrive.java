package problem4_prototype;

public class CustomerTestDrive {
    public static void main(String[] args) {
        OfficeProcess mainProcess = new OfficeProcess();
        LoVolCustomer low = new LoVolCustomer(null, null);
        MedVolCustomer medium = new MedVolCustomer(null, null);
        HivolCustomer high = new HivolCustomer(null, null);

        mainProcess.register("high", high);
        mainProcess.register("medium", medium);
        mainProcess.register("low", low);

        mainProcess.setName();
        mainProcess.setType();
        mainProcess.setCustomer();

    }
}
