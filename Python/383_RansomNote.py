class Solution:
    def canConstruct(self, ransomNote: str, magazine: str) -> bool:
        alphabet = [0] * 26
        for character in magazine:
            alphabet[ord(character) - ord('a')] += 1
        for character in ransomNote:
            index = ord(character) - ord('a')
            if alphabet[index] <= 0:
                return False
            alphabet[index] -= 1
        return True