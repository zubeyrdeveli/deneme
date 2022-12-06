package day11_S_witch;

public class Browser {

    public static void main(String[] args) {

        String browserName = "chrome";

        String result = "";

        boolean validBrowser = browserName == "chrome" || browserName == "firefox" || browserName == "opera" || browserName == "safari"
                || browserName == "edge";

        if (validBrowser ){
            if (browserName == "chrome"){result = "Chrome Browser is selected";
            } else if (browserName== "firefox") {result = "Firefox Browser is selected";

            } else if (browserName== "opera") {result = "Opera Browser is selected";

            } else if (browserName == "safari") {result = "Safari Browser is selected";

            }

        } else {result = "Edge Browser is selected";
        }

        System.out.println("result = " + result);


    }
}
