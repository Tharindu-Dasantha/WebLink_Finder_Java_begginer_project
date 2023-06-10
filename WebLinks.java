public class WebLinks {
    public static void main(String[] args) {
        // testing the code
        webLinks("\"http://www.youtube.com/watch?v=sdzjcBhrgp0&feature=youtu.be\"- Information Week March 25, 2013");
    }

    public static void webLinks(String link) {
        int index = link.indexOf("youtube.com");
        if (index == -1) {
            System.out.println("There is no youtube link in here");
        }
        // If there is a link in here
        int StartIndex = link.lastIndexOf("\"", index - 6);
        int EndIndex =  link.indexOf("\"", index);

        String newLine = link.substring(StartIndex + 1, EndIndex);
        System.out.println(newLine);
    }
}
