import sys

def solve_captcha(input, distance):
    sum = 0
    for i in range(0, len(input)):
        first = input[i]
        second = input[(i + distance) % len(input)]
        if first == second :
            sum += int(first)
    return sum

arg = str(sys.argv[1])

print("Part 1 : " + str(solve_captcha(arg, 1)))
print("Part 2 : " + str(solve_captcha(arg, int(len(arg) / 2))))