// Implementoni një klasë Adresa. Një adresë ka numrin, rrugën, numrin e apartamentit (opsional),
// qytetin, shtetin dhe kodin postar ndërtoni dy konstruktorë: një me numrin e apartamentit dhe
// tjetri pa të. Ndërtoni metodën print që afishon të dhënat. Ndërtoni një metodë method public
// boolean comesBefore(Address other) që teston nëse kjo adresë vjen përpara adresës tjetër, duke
// u nisur nga kodi postar.

public class Usht1 {
    public static void main(String[] args) throws Exception {
        Address address1 = new Address(124, 20, "Tirana", "Albania", 1001);
        Address address2 = new Address(124, 20, 217, "Tirana", "Albania", 1001);
        address1.printInfo();
        System.out.println();
        address2.printInfo();
    }
}
