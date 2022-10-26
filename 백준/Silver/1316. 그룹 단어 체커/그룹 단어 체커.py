n = int(input())  # 그룹단어의 개수를 입력한다.
# 비교 후 같지 않을 때만 조건문 걸어서 갯수를 하나 줄이도록 한다.

for _ in range(n):
    word = input()
    for i in range(len(word) - 1): # 앞 뒤 비교니까 -1
        if word[i] != word[i + 1]: # 앞 뒤 다를 경우 바로 비교
            if word[i] in word[i + 1:]: # 다른데 뒤에 해당 문자열 있으면 -1
                n -= 1
                break
print(n)
