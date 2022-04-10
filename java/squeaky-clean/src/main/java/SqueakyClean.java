import java.lang.String;
import java.lang.Character;

class SqueakyClean {
    static String clean(String identifier) {
        identifier = identifier.replace(" ", "_");
        identifier = identifier.replaceAll("[\u0000]", "CTRL");

        for (int i = 0; i < identifier.length(); i++) {
            String c = identifier.substring(i, i+1);
            Character ch = identifier.charAt(i);
            if (c.equals("-") && (i+1 < identifier.length())) {
                Character nextc = identifier.charAt(i+1);
                Character newc = Character.toUpperCase(nextc);
                identifier = identifier.replaceAll(nextc.toString(), newc.toString());
            }
            if (!(Character.isLetter(ch) || c.equals("_"))) {
                identifier = identifier.replace(ch.toString(), "-");
            }
        }
        identifier = identifier.replace("-", "");

        identifier = identifier.replaceAll("[\u03B1-\u03C9]", "");

        return identifier;
    }
}
