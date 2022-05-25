public class test{

}
    public void findPath( int startX, int startY, int endX, int endY) {

        boolean isEmpty = false;
        boolean isFound = false;
        int i = 0;

        Move start = new Move(startX, startY);

        start.direction = 0;
        stack.push(start);

        while(isEmpty == false && isFound == false) {

            Move curPos = stack.pop();
            int x = curPos.x;
            int y = curPos.y;
            int direction = curPos.direction;

            while(isFound == false && direction < NUMDIRECTIONS) {

                int newX = x + DIRECTION_OFFSETS[direction][0];
                int newY = y + DIRECTION_OFFSETS[direction][1];

                if (newX >= 0 && newX < WIDTH
                        && newY >= 0 && newY < HEIGHT
                        && maze.myMaze[newY][newX] == NOTVISIT
                        && markArray[newY][newX] == NOTVISIT) {
                    Move newPosition = new Move(newX, newY);
                    newPosition.direction = direction + 1;
                    stack.push(newPosition);
                    markArray[y][x] = VISIT;

                    x = newX;
                    y = newY;
                    direction = 0;

                    if (newX == endX && newY == endY) {
                        isFound = true;
                        newPosition.x = newX;
                        newPosition.y = newY;
                        newPosition.direction = 0;
                        stack.push(newPosition);
                        markArray[newY][newX] = VISIT;
                    }
                }
                else direction++;
            }//end-of-while
            isEmpty = stack.isEmpty();
        }//end-of-while
    }
