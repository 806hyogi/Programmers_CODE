package programmus;

public class Solution {
	public static int[] solution(String s) {
		int[] answer = new int[2];

		int zero = 0; // 회차 개수
		int count = 0; // 제거할 0의 개수
		int l = 0;

		// s가 1일 아닐때 까지 반복
		while (!s.equals("1")) {

			zero++;
			l = 0;
			for (int i = 0; i < s.length(); i++) {

				if (s.charAt(i) == '0') { // s에 0이 존재하면
					count++; // 0의 개수 올림
				} else { // 1이 있으면
					l++;

				}
			}
			s = Integer.toBinaryString(l);

		}

		answer[0] = zero;
		answer[1] = count;

		return answer;

	}

	public static void main(String[] args) {
		solution("110010101001");
	}
}
