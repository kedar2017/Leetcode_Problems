def activityNotifications(expenditure, d):
    count_1 = 0
    sum = 0
    carry_over = 0

    count = [0 for i in range(200)]

    for i in range(d):
        count[expenditure[i]] = count[expenditure[i]] + 1

    for i in range(d, len(expenditure)):

        carry_over = 0
        median1 = 0
        median2 = 0
        median = 0

        for j in range(200):

            carry_over = carry_over + count[j]

            if d % 2 == 0:

                if carry_over-1 == d / 2:
                    median1 = j
                    break

        carry_over = 0
        for j in range(200):

            carry_over = carry_over + count[j]

            if carry_over - 1 == (d-1) // 2:
                median2 = j
                break

        if d % 2 == 0:
            median = (median1 + median2) / 2
        else:
            median = median2

        if expenditure[i] >= 2 * median:
            count_1 = count_1 + 1

        print(count_1)
        count[expenditure[i - d]] = count[expenditure[i - d]] - 1
        count[expenditure[i]] = count[expenditure[i]] + 1

    return count_1

expediture = [10, 20, 30, 40, 50,60,70,80,80]
n = 5
d = 3

activityNotifications(expediture, d)
