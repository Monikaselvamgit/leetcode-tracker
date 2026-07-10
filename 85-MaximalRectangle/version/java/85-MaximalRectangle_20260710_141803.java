// Last updated: 7/10/2026, 2:18:03 PM
1import java.util.*;
2
3class Solution {
4
5    public int maximalRectangle(char[][] matrix) {
6
7        if (matrix == null || matrix.length == 0)
8            return 0;
9
10        int rows = matrix.length;
11        int cols = matrix[0].length;
12
13        int[] heights = new int[cols];
14        int maxArea = 0;
15
16        for (int i = 0; i < rows; i++) {
17
18            for (int j = 0; j < cols; j++) {
19
20                if (matrix[i][j] == '1')
21                    heights[j]++;
22                else
23                    heights[j] = 0;
24            }
25
26            maxArea = Math.max(maxArea, largestRectangleArea(heights));
27        }
28
29        return maxArea;
30    }
31
32    public int largestRectangleArea(int[] heights) {
33
34        Stack<Integer> stack = new Stack<>();
35        int maxArea = 0;
36
37        for (int i = 0; i <= heights.length; i++) {
38
39            int h = (i == heights.length) ? 0 : heights[i];
40
41            while (!stack.isEmpty() && h < heights[stack.peek()]) {
42
43                int height = heights[stack.pop()];
44
45                int width;
46
47                if (stack.isEmpty())
48                    width = i;
49                else
50                    width = i - stack.peek() - 1;
51
52                maxArea = Math.max(maxArea, height * width);
53            }
54
55            stack.push(i);
56        }
57
58        return maxArea;
59    }
60}