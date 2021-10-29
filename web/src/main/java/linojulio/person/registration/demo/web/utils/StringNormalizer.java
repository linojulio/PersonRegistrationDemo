package linojulio.person.registration.demo.web.utils;

public class StringNormalizer {
    public String normalizePhoneNumber(String phone) {
        return phone.trim().replace("-", "").replace("+", "");
    }
}
