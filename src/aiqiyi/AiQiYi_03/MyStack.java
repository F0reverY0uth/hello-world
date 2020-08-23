package aiqiyi.AiQiYi_03;

import java.util.LinkedList;

class MyStack{
    private int num;
    private LinkedList<Character> data;

    public MyStack(){
        this.num = 0;
        data = new LinkedList<Character>();
    }

    /**
     * 判断栈是否为空
     * @return
     */
    public boolean isEmpty(){
        return num == 0 ? true : false;
    }

    /**
     * 入栈
     * @param ch
     */
    public void push(Character ch){
        this.data.add(ch);
        this.num++;
    }

    /**
     * 出栈
     * @return
     */
    public Character pop(){
        //栈为空时，返回' '
        if(this.isEmpty()){
            return ' ';
        }
        Character ch = this.data.remove(data.size()-1);
        this.num--;
        return ch;
    }
}