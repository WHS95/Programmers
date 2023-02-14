function solution(strings, n) {
  let answer = strings.sort((a, b) => {
     if(a[n] > b[n]) return 1;
      if(a[n] < b[n]) return -1;
      //내림차순으로 하기위에 뒤에값 b가 클때를 음수를 준다.
      if(a[n] === b[n]){
          if(a>b) return 1;
          if(a<b) return -1;
          //내림차순으로 하기위에 뒤에값 b가 클때를 음수를 준다.
          return 0;
      }
  });
  
  return answer;
}
