# Below is the function I wrote, which is same to function "find_outliers"

def find_outliers_boxplot(numbers):
    res = []

    # compute max and min
    max_val = numbers.max()
    min_val = numbers.min()

    # construct the range using third quartile and first quartile
    third_quartile = np.percentile(numbers, 75)
    first_quartile = np.percentile(numbers, 25)
    IQR = third_quartile - first_quartile

    lower_bound = first_quartile - 1.5 * IQR
    higher_bound = third_quartile + 1.5 * IQR

    # find a list of numbers that are outside the range
    for each in numbers:
        if each > higher_bound or each < lower_bound:
            res.append(each)
    return res


print('The list of outliers: ', find_outliers_boxplot(numbers))
