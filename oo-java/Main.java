public class Main {

  public static void main(String[] args) {
    System.out.println("Beginning forum example");
    if (args.length < 2) {
      System.out.println("Usage: java Main <first name> <last name>");
      System.err.println("<first name> and <last name> are required");
      System.exit(1);
    }

    Forum forum = new Forum("Java");
    // COMPLETED: pass in the first name and last name that are in the args parameter
    User author = new User(args[0], args[1]);
    // COMPLETED: initialize the forum post with the user created above and a title and description of your choice
    ForumPost post = new ForumPost(author, "Snow in Amsterdam", "It was our first Christmas in Amsterdam");
    forum.addPost(post);
  }

}
