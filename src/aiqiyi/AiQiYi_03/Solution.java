package aiqiyi.AiQiYi_03;

class Solution {

    /**
     * 判定左右括号是否匹配
     * @param left
     * @param right
     * @return
     */
    private boolean check(char left , char right){
        if(left == '('){
            return right == ')' ? true : false;
        }

        if(left == '['){
            return right == ']' ? true : false;
        }

        if(left == '{'){
            return right == '}' ? true : false;
        }
        return false;
    }

    /**
     * 核心方法
     * @param s
     * @return
     */
    public boolean isValid(String s) {
        char[] temp = s.toCharArray();
        MyStack stack = new MyStack();
        boolean flag = true;
        for(int i = 0 ; i < temp.length ; i++){
            //左括号，入栈
            if(temp[i] == '(' || temp[i] == '{' || temp[i] == '['){
                stack.push(temp[i]);
            }
            else{
                //右括号，出栈
                char left = stack.pop();
                //如果从栈中取出空值，说明栈已空，但还有右括号存在，肯定不匹配
                if(left == ' ') {
                    flag = false;
                }
                //如果左右括号不匹配，则失败
                if(!check(left,temp[i])){
                    flag = false;
                }
            }
        }
        //循环完毕后，若栈不空，说明左括号个数大于右括号，不匹配
        if(flag){
            if(!stack.isEmpty()){
                flag = false;
            }
        }
        return flag;
    }
}