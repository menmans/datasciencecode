def separate_words(paragraph):
    words = paragraph.split()
    word_count = {}

    # Counting occurrences of each word
    for word in words:
        if word in word_count:
            word_count[word] += 1
        else:
            word_count[word] = 1

    # Separating repeated and non-repeated words
    repeated_words = []
    non_repeated_words = []
    for word, count in word_count.items():
        if count > 1:
            repeated_words.append(word)
        else:
            non_repeated_words.append(word)

    return repeated_words, non_repeated_words

paragraph = input("Enter the paragraph: ")
repeated, non_repeated = separate_words(paragraph)

print("Repeated words:", repeated)
print("Non-repeated words:", non_repeated)
