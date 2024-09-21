package problems.Stack;

import java.util.Stack;

/*
PROBLEM STATEMENT : converting the file path from absolutePath to canonicalPath
 */

/*
 absolute path structure
 1. '.'-> indicates the current file
 2. '..'-> navigating to previous directory
 */
public class FilePath {

    public static String getCanonicalPath(String path){
        String[] Components =  path.split("/");
        Stack<String> stack =  new Stack<>();
        for(String component:Components){
            if(component.equals("") || component.equals(".")) {
                continue;
            }else if(component.equals("..")){
                if(!stack.isEmpty()) {
                    stack.pop();
                }
            } else{
                stack.push(component);
            }
        }

        //Canonical path should not end with '/'
        StringBuilder canonicalPath = new StringBuilder();
        for(String dir:stack){
            canonicalPath.append("/").append(dir);
        }

        return canonicalPath.toString();
    }

    public static void main(String[] args) {
        System.out.println(getCanonicalPath("/home/user/../user/docs/./file.txt"));
        System.out.println(getCanonicalPath("/a/./b/../../c/"));
    }
}
