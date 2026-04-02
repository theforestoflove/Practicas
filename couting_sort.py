def counting_sort(arr):
    max_val = max(arr)
    count = [0] * (max_val + 1)

    # Contar
    for num in arr:
        count[num] += 1

    # Reconstruir
    sorted_arr = []
    for i in range(len(count)):
        sorted_arr.extend([i] * count[i])

    return sorted_arr


arr = [5, 3, 8, 6, 2, 7, 4, 1, 3, 6, 8, 2, 5, 9, 0, 4, 7, 1, 3, 2]
print(counting_sort(arr))