import { useNavigate, Link } from "react-router-dom";
import useLogout from "../hooks/useLogout";

const Home = () => {
  const navigate = useNavigate();
  const logout = useLogout();

  const signOut = async () => {
    await logout();
    navigate("/linkpage");
  };

  return (
    <section>
      <h1>Dashboard</h1>
      <br />
      <p>You are logged in!</p>
      <br />
      <Link to="/currentAccountBalance">Current Account Balance</Link>
      <br />
      <Link to="/currentLoans">Current Loans</Link>
      <br />
      <Link to="/loanHistory">Loan History</Link>
      <br />
      <Link to="/linkpage">Go to the link page</Link>
      <div className="flexGrow">
        <button onClick={signOut}>Sign Out</button>
      </div>
    </section>
  );
};

export default Home;
