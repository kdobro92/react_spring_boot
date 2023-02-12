import { useEffect, useState } from "react";
import axios from "axios";

function About() {
  const [articles, setArticles] = useState(null);
  const [loading, setLoading] = useState(false);
  const [error, setError] = useState(null);

  const fetchArticles = async () => {
    try {
      setArticles(null);

      // api로부터 article정보 가져오기
      const response = await axios.get("http://localhost:8080/api/articles");

      setArticles(response.data);
    } catch (e) {
      setError(e);
    }
    setLoading(false);
  };

  useEffect(() => {
    fetchArticles();
  }, []);

  if (loading) return <div>로딩중..</div>;
  if (error) return <div>에러가 발생했습니다</div>;

  if (!articles) return null;

  return (
    <div>
      <ul>
        {articles.map((articles) => (
          <li key={articles.id}>
            title: {articles.title}
            <div></div>
            content: {articles.contents}
          </li>
        ))}
      </ul>
      --button을 클릭하면 API를 다시 불러와줍니다.
      <button onClick={fetchArticles}>다시 불러오기</button>
    </div>
  );
}

export default About;
