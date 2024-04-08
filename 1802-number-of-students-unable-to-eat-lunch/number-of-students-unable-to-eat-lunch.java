class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int pointer = 0;
        int eatC = 0;
        int prevP = -1;
        while(prevP != pointer && pointer < sandwiches.length) {
            prevP = pointer;
            for(int i = 0;i<students.length;i++) {
                if(students[i] == -1)
                    continue;
                if(students[i] == sandwiches[pointer]) {
                    pointer++;
                    eatC++;
                    students[i] = -1;
                }
            }
        }
        return pointer == sandwiches.length ? 0 : students.length - eatC;
    }
}