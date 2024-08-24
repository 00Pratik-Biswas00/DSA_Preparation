package others;

import java.util.ArrayList;

class PrettyJSON {
  private static String tab = "\t";

  public static String addTabs(int count) {
    StringBuilder tabs = new StringBuilder();
    for (int j = 0; j < count; j++) {
      tabs.append(tab);
    }

    return tabs.toString();
  }

  public static ArrayList<String> prettyJSON(String str) {
    // A pointer to the last row.
    int r = 0;

    ArrayList<StringBuilder> result = new ArrayList<StringBuilder>();
    result.add(new StringBuilder(""));

    int brace = 1;
    for (int i = 0; i < str.length(); ++i) {
      switch (str.charAt(i)) {
        // Space just ignore.
        case ' ':
          continue;

        case '{':
        case '[':
          // If first brace.
          if (brace == 1 && r == 0) {
            result.get(r).append(str.charAt(i));
          } else {
            // Make a new line and add adequate spaces and increment braces.
            result.add(new StringBuilder(""));
            r++;
            result.get(r).append(addTabs(brace));
            result.get(r).append(str.charAt(i));
            ++brace;
          }
          result.add(new StringBuilder(""));
          r++;
          result.get(r).append(addTabs(brace));
          break;

        case '}':
        case ']':
          // Make a new line and decrement braces.
          if (brace > 1) {
            result.add(new StringBuilder(""));
            r++;
            result.get(r).append(addTabs(brace));
            result.get(r).append(str.charAt(i));
            --brace;
          } else {
            result.add(new StringBuilder(""));
            r++;
            result.get(r).append(str.charAt(i));
            --brace;
          }
          break;

        case ',':
          result.get(r).append(str.charAt(i));
          // Corner case check.
          if (str.charAt(i + 1) == '{' || str.charAt(i + 1) == '[')
            continue;
          else {
            result.add(new StringBuilder(""));
            r++;
            result.get(r).append(addTabs(brace));
          }
          break;

        case ':':
          result.get(r).append(str.charAt(i));
          if (str.charAt(i + 1) == '{' || str.charAt(i + 1) == '[') {
            result.add(new StringBuilder(""));
            r++;
            result.get(r).append(addTabs(brace));
            i++;
            result.get(r).append(str.charAt(i));
            ++brace;
            if (str.charAt(i + 1) != '{' && str.charAt(i + 1) != '[') {
              result.add(new StringBuilder(""));
              r++;
              result.get(r).append(addTabs(brace));
              i++;
              result.get(r).append(str.charAt(i));
            }
          }
          break;

        default:
          // For all other cases.
          result.get(r).append(str.charAt(i));
          break;
      }
    }
    ArrayList<String> res = new ArrayList();
    for (StringBuilder sb : result) {
      res.add(sb.toString());
    }
    return res;
  }

  public static void main(String[] args) {

    String matrix = "[\"foo\", {\"bar\":[\"baz\",null,1.0,2]}]";

    ArrayList<String> res = new ArrayList<>();
    res = prettyJSON(matrix);
    for (String i : res)
      System.out.print(i);

    System.out.println();
  }
}
