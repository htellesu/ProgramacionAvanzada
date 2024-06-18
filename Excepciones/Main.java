import java.util.List;
import java.util.Arrays;

public class Main {

    public static void triggerExceptions(String input) throws KeywordException, CharacterException, SymbolException, Exception {
        List<String> keywords = Arrays.asList("error", "fail", "invalid");
        List<Character> forbiddenCharacters = Arrays.asList('x', 'y', 'z');
        List<Character> symbols = Arrays.asList('@', '#', '$');

        for (String keyword : keywords) {
            if (input.contains(keyword)) {
                throw new KeywordException("Este es un KeywordException: se detectó la palabra clave no permitida '" + keyword + "'.");
            }
        }

        for (char ch : input.toCharArray()) {
            if (forbiddenCharacters.contains(ch)) {
                throw new CharacterException("Este es un CharacterException: se detectó el carácter no permitido '" + ch + "'.");
            }
        }

        for (char ch : input.toCharArray()) {
            if (symbols.contains(ch)) {
                throw new SymbolException("Este es un SymbolException: se detectó el símbolo no permitido '" + ch + "'.");
            }
        }

        // Default case if no specific exception is triggered
        throw new Exception("Tipo de excepción no reconocido para la entrada: " + input);
    }

    public static void main(String[] args) {
        String[] inputsToTest = {
            "This is an error message",
            "This string contains x character",
            "This string contains a @ symbol",
            "This string is safe"
        };

        for (String input : inputsToTest) {
            try {
                System.out.println("Probando con la entrada: " + input);
                triggerExceptions(input);
            } catch (NullPointerException npe) {
                System.out.println("Capturada una excepción del sistema (NullPointerException): " + npe.getMessage());
            } catch (ArrayIndexOutOfBoundsException aioobe) {
                System.out.println("Capturada una excepción del sistema (ArrayIndexOutOfBoundsException): " + aioobe.getMessage());
            } catch (NumberFormatException nfe) {
                System.out.println("Capturada una excepción del sistema (NumberFormatException): " + nfe.getMessage());
            } catch (KeywordException ke) {
                System.out.println("Capturada KeywordException: " + ke.getMessage());
            } catch (CharacterException ce) {
                System.out.println("Capturada CharacterException: " + ce.getMessage());
            } catch (SymbolException se) {
                System.out.println("Capturada SymbolException: " + se.getMessage());
            } catch (Exception e) {
                System.out.println("Capturada una excepción general: " + e.getMessage());
            }
        }
    }
}
