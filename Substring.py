def substrCount(n, s):

    count = 0

    for i in range(len(s)):

        left = i
        right = i


        curr = s[i]

        while left >= 0 and right <= len(s) - 1 and s[right] == s[left]:

            prev = curr
            curr = s[right]

            if right - left > 2 and prev != curr:

                break

            count = count + 1
            left = left - 1
            right = right + 1

        left = i
        right = i + 1

        curr = s[i]

        while left >= 0 and right <= len(s) - 1 and s[right] == s[left]:

            prev = curr
            curr = s[right]

            if prev != curr:

                break

            count = count + 1
            left = left - 1
            right = right + 1

    print(count)

    return count

s = "abcbaba"
n = 7

substrCount(n,s)