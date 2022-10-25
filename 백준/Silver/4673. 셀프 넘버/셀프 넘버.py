# 셀프 넘버
# 양의 정수 n에 대해서 d(n)을 n과 n의 각 자리수를 더하는 함수라고 정의
# 에 따라 함수를 정의한다.

# set으로 중복되는 숫자 제거

# 10000 이하까지 for 문을 돌리면서
# s_set에 add 하고 차집합 기능을 이용해서 
# 셀프넘버 출력 

def d(n):
    x = 0
    a = list(str(n))
    for i in a:
        x = x + int(i)
    return n + x


s_set = set()
for k in range(1, 10000):
    s_set.add(d(k))
result = set(range(1, 10000)) - s_set
for num in sorted(result):
    print(num)
