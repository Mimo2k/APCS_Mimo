import java.util.*;

class Review {
    private String comment;
    public Review(String comment) { this.comment = comment; }
    public String getComment() { return comment; }
}

class Ac1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of reviews: ");
        int n = Integer.parseInt(s.nextLine());
        List<Review> reviews = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            System.out.print("Enter comment " + (i + 1) + ": ");
            reviews.add(new Review(s.nextLine()));
        }

        collectComments(reviews).forEach(System.out::println);
        s.close();
    }

    public static List<String> collectComments(List<Review> reviews) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < reviews.size(); i++) {
            String comment = reviews.get(i).getComment();
            if (comment.contains("!")) {
                String formatted = i + "-" + comment;
                if (!comment.endsWith("!") && !comment.endsWith(".")) {
                    formatted += ".";
                }
                result.add(formatted);
            }
        }
        return result;
    }
}