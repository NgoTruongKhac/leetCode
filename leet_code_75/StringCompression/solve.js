const compress = (chars) => {
  const n = chars.length;
  let write = 0;
  let read = 0;

  while (read < n) {
    const current = chars[read];
    let groupEnd = read;
    while (groupEnd < n && chars[groupEnd] == current) {
      groupEnd++;
    }
    const count = groupEnd - read;

    chars[write++] = current;

    if (count > 1) {
      const s = count.toString();
      for (const c of s) {
        chars[write++] = c;
      }
    }

    read = groupEnd;
  }

  return write;
};
