def length_of_longest_substring(text):
    # Use a set to keep track of characters in the current window
    # Sets are faster than lists for checking "is this character inside?"
    current_window = set()
    
    start_index = 0
    max_length = 0
    
    # Iterate through the string with an 'end_index'
    for end_index in range(len(text)):
        current_char = text[end_index]
        
        # If we found a duplicate, we need to shrink the window from the left
        # We keep removing characters until the duplicate is gone
        while current_char in current_window:
            char_to_remove = text[start_index]
            current_window.remove(char_to_remove)
            start_index += 1
            
        # Add the new character to our window
        current_window.add(current_char)
        
        # Check if this is the longest substring we've seen so far
        current_length = end_index - start_index + 1
        if current_length > max_length:
            max_length = current_length
            
    return max_length

# --- Simple Testing ---
if __name__ == "__main__":
    input_str = "abcabcbb"
    result = length_of_longest_substring(input_str)
    print(f"The longest substring length for '{input_str}' is: {result}")
